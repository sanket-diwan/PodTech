package com.thinkitive.trst;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class )
@CucumberOptions(features = "src\\main\\resources\\Features",
        glue = "com.thinkitive.trst.glue")
public class Runner {
}



