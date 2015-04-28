package headfirst.command.party;

public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
 
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
		Command[] partyMix = {lightOn, lightOff, lightOn, lightOff};
		Command[] partyUn = {hottubOn, hottubOff};
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		MacroCommand partyLight = new MacroCommand(partyMix);
		MacroCommand partyUnn = new MacroCommand(partyUn);
 
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
		remoteControl.setCommand(1, partyLight, partyUnn);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
		remoteControl.offButtonWasPushed(1);
		System.out.println("--- Pushing undo---");
		remoteControl.undoButtonWasPushed();
	}
}
