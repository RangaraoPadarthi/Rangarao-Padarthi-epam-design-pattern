package com.ranga.epam_design_pattern;
import com.ranga.Adapter.*;
import com.ranga.BridgePattern.*;
import com.ranga.CommandPattern.*;
import com.ranga.PrototypePattern.*;
import com.ranga.SingletonPattern.*;
import com.ranga.TemplatePattern.*;

public class App 

{

    @SuppressWarnings("unused")

	public static void main( String[] args )

    {

		TemplatePatternDemo t = new TemplatePatternDemo();

		DriverSingleton s = new DriverSingleton();

		DriverAdapter a = new DriverAdapter();

		DriverCommand c = new DriverCommand();

		DriverBridge b = new DriverBridge();

		DriverPrototype p = new DriverPrototype();

    }

}