package io.swagger.codegen.options;

import io.swagger.codegen.CodegenConstants;
import io.swagger.codegen.languages.JavaClientCodegen;

import java.util.HashMap;
import java.util.Map;

public class JavaClientOptionsProvider extends JavaOptionsProvider {

    public static final String PERFORM_BEANVALIDATION = "false";

    public static final String DEFAULT_LIBRARY_VALUE = "jersey2";

    @Override
    public Map<String, String> createOptions() {
        Map<String, String> options = new HashMap<String, String>(super.createOptions());
        options.put(CodegenConstants.LIBRARY, DEFAULT_LIBRARY_VALUE);
        options.put(JavaClientCodegen.USE_RX_JAVA, "false");
        options.put(JavaClientCodegen.JACKSON, "false");
        options.put(JavaClientCodegen.BIDIRECTIONAL_RELATIONSHIPS, "false");
        options.put(JavaClientCodegen.USE_RX_JAVA2, "false");
        options.put(JavaClientCodegen.USE_PLAY24_WS, "false");
        options.put(JavaClientCodegen.PARCELABLE_MODEL, "false");
        options.put(JavaClientCodegen.SUPPORT_JAVA6, "false");
        options.put(JavaClientCodegen.USE_BEANVALIDATION, "false");
        options.put(JavaClientCodegen.PERFORM_BEANVALIDATION, PERFORM_BEANVALIDATION);
        options.put(JavaClientCodegen.USE_GZIP_FEATURE, "false");

        return options;
    }

}
