package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils;

public class MHCommand {
	
	private String petition;
	
	private String argument;
	
	public MHCommand(String petition, String[] arguments){
		
		this.petition = petition;
		this.argument = buildArgument(arguments);
		
	}
	
	public String buildArgument(String[] arguments){
		
		String argument = "";
		if(arguments.length > 1){
			for (int i = 0; i < arguments.length; i++) {
				if(i<(arguments.length - 1)){
					argument += arguments[i] +" ";
				}else{
					argument += arguments[i];
				}
			}
		}else if(arguments.length == 1){
			argument = arguments[0];
		}else{
			argument = "error";
		}
		
		return argument;
		
	}

	public String getPetition() {
		return petition;
	}

	public String getArgument() {
		return argument;
	}
	
	

}
