package configuracion;

import java.util.Locale;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//ESTA FORMA DE CONFIGURAR EL DISPATHCER ES PARA TENER TODO EL CONTROL SOBRE SU CONFIGURACIÓN
//EN EL OTRO FICHERO VEREMOS UNA FORMA MAS DE HACERLO

//importante para que se activan todas las configuraciones de mvc 
@EnableWebMvc
//Tan solo con esto ya no necesitaríamos nuestro fichero de configuración de spring, tendría que sustituirlo por estas dos clases que que tenemos en este paquete
@Configuration
@EnableJpaRepositories(basePackages = "repository")
@ComponentScan(basePackages = { "controller", "service", "repository"})
@EntityScan("model.VO")
//VAMOS A INTRODUCIR EL USO DE ESTA INTERFZ PARA PODER USAR LOS FORAMTEADORES 
public class ConfigApp implements WebMvcConfigurer {
	 
	 @Bean
	    public DataSource dataSource() {
	        // Configura el datasource que se utilizará para la conexión a la base de datos
	        BasicDataSource dataSource = new BasicDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/tienda_curso_serbatic");
	        dataSource.setUsername("root");
	        dataSource.setPassword("");
	        //CUIDADO
	        dataSource.setDefaultAutoCommit(true);
	        return dataSource;
	    }

	    @Bean
	    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	        // Configura el entity manager factory
	        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
	        em.setDataSource(dataSource());
	        em.setPackagesToScan("model.VO");
	        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	        em.setJpaVendorAdapter(vendorAdapter);
	        return em;
	    }

	    @Bean
	    public PlatformTransactionManager transactionManager() {
	        // Configura el transaction manager
	        JpaTransactionManager transactionManager = new JpaTransactionManager();
	        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
	        return transactionManager;
	    }
	
	// ES MUY IMPORTANTE ACORDARSE DE QUE EL VIEW RESOLVER ES UN BEAN DENTRO DE
	// SPRING, YA QUE TODOS LOS OBJETOS QUE QUEREMOS USAR DESDE SPRING LO SON
	@Bean
	public InternalResourceViewResolver viewResolver() {

		System.out.println("Cargamos el viewResolver");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setPrefix("/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;

	}

	@Bean
	public InternalResourceViewResolver viewResolver2() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/view/");
		viewResolver.setSuffix(".html");
		return viewResolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("registramos el directorio de recursos");
		registry.addResourceHandler("/view/**").addResourceLocations("/view/");
	}
	
	


}
