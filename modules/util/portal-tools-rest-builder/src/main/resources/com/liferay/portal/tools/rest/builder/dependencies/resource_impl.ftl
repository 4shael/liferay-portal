package ${configYAML.apiPackagePath}.internal.resource;

import ${configYAML.apiPackagePath}.resource.${schemaName}Resource;

import com.liferay.portal.kernel.model.Company;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * @author ${configYAML.author}
 */
@Component(
	properties = "OSGI-INF/${schemaPath}.properties",
	service = ${schemaName}Resource.class
)
public class ${schemaName}ResourceImpl extends Base${schemaName}ResourceImpl {
}