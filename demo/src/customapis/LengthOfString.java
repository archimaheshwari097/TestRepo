package customapis;


import java.util.Date;
import java.util.logging.Logger;

import com.provar.core.model.base.api.ValueScope;
import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.TestApi;
import com.provar.core.testapi.annotations.TestApiExecutor;
import com.provar.core.testapi.annotations.TestApiParameter;
import com.provar.core.testapi.annotations.TestApiParameterGroup;
import com.provar.core.testapi.annotations.TestApiParameterGroups;
import com.provar.core.testapi.annotations.TestExecutionContext;
import com.provar.core.testapi.annotations.TestLogger;

@TestApi( title="Length Of String"
        , summary=""
        , remarks=""
        , iconBase=""
        , defaultApiGroups={"Custom"}
        )
@TestApiParameterGroups(parameterGroups={
	    @TestApiParameterGroup(groupName="inputs", title="Inputs"),
	    @TestApiParameterGroup(groupName="result", title="Result"),
	    })
public class LengthOfString {
    
    @TestApiParameter(seq=1, 
            summary="The first parameter's summary.",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public String inputString;
    
    @TestApiParameter(seq=1, 
            summary="The first parameter's summary.",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public Date inputDate;



    @TestApiParameter(seq=10, 
            summary="The name that the result will be stored under.",
            remarks="",
            mandatory=true,
            parameterGroup="result")
    public String resultName;

    @TestApiParameter(seq=11, 
            summary="The lifespan of the result.",
            remarks="",
            mandatory=true,
            parameterGroup="result",
            defaultValue="Test")
    public ValueScope resultScope;

    /** 
     * Used to write to the test execution log.
     */
    @TestLogger
    public Logger testLogger;
    
    /** 
     * Provides access to facilities, mainly to set and get variable values.
     */
    @TestExecutionContext
    public ITestExecutionContext testExecutionContext;
    
    @TestApiExecutor
    public void execute() {

    	
    	int lenght=inputString.length();
    	// Put our implementation logic here.
    	testLogger.info("Hello from " + this.getClass().getName());
    	testLogger.info("test");

        // Store the result (if appropriate).
    	
        testExecutionContext.setValue(resultName, lenght, resultScope);
        
    }
    
}
