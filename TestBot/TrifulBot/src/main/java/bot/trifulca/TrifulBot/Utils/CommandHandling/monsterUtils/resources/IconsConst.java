package bot.trifulca.TrifulBot.Utils.CommandHandling.monsterUtils.resources;

public class IconsConst {

	public static final String FIRE = "<:firemh:415441789260922880>";
	
	public static final String FIREARZ = "<:firemh:415441789260922880> (Parte delantera)";
	
	public static final String FIREBA = "<:firemh:415441789260922880> (Sin lodo)";
	
	public static final String FIREBAES = "<:firemh:415441789260922880> (Con nieve)";
	
	public static final String FIREAGGL = "<:firemh:415441789260922880> (Con hielo)";
	
	public static final String FIREALA = "<:firemh:415441789260922880> (Volando)";

	public static final String THUNDER = "<:thundermh:415441789101539329>";
	
	public static final String THUNDERBAES = "<:thundermh:415441789101539329> (Sin nieve)";

	public static final String ICE = "<:icemh:415441789265248256>";
	
	public static final String ICEARZ = "<:icemh:415441789265248256> (Parte trasera)";
	
	public static final String ICEALA = "<:icemh:415441789265248256> (Posado)";
	
	public static final String ICEMI = "<:icemh:415441789265248256> (Modo armadura)";

	public static final String WATER = "<:watermh:415441789403791360>";
	
	public static final String WATERBA = "<:watermh:415441789403791360> (Con lodo)";
	
	public static final String WATERAG = "<:watermh:415441789403791360> (Con lava)";
	
	public static final String WATERALA = "<:watermh:415441789403791360> (Posado)";

	public static final String DRAGON = "<:dragonmh:415441789210722304>";
	
	public static final String DRAGONAG = "<:dragonmh:415441789210722304> (Sin lava)";
	
	public static final String DRAGONAGGL = "<:dragonmh:415441789210722304> (Sin hielo)";
	
	public static final String DRAGONALA = "<:dragonmh:415441789210722304> (Volando)";

	public static final String PARALISIS = "<:paralisismh:415441789399334922>";

	public static final String SLEEP = "<:sleepmh:415441789487546378>";
	
	public static final String SLEEPQU = "<:sleepmh:415441789487546378> (Rango G)";

	public static final String SNOWMAN = "<:snowmanmh:415441789248339980>";

	public static final String SOIL = "<:soiledmh:415441789038886913>";

	public static final String MUDMAN = "<:mudmanmh:415441789349265408>";
	
	public static final String STUN = "<:stunmh:415460481239744513>";
	
	public static final String DEFENSEDOWN = "<:defensedownmh:415460481000800259>";

	public static final String ORE = "<:oremh:415441789328031764>";

	public static final String HERB = "<:herbmh:415441789260922890>";

	public static final String HUSK = "<:huskmh:415441789361848320>";

	public static final String HONEY = "<:honeymh:415441789005201411>";

	public static final String WEB = "<:webmh:415441789462380544>";

	public static final String WHETSTONE = "<:whetstonemh:415441789428695040>";

	public static final String FISH = "<:fishmh:415441789298802689>";

	public static final String SEED = "<:seedmh:415441789369974784>";

	public static final String DUNG = "<:dungmh:415441789411917824>";

	public static final String UNKNOWN = "<:unknownmh:415441789139419140>";

	public static final String BAIT = "<:baitmh:415441789101670401>";

	public static final String BONE = "<:bonemh:415441788833103883>";

	public static final String MUSHROM = "<:mushrommh:415441789319905300>";

	public static final String BUG = "<:bugmh:415446889278865409>";
	
	public static final String SECRETZONE = "<:secretzonemh:415468816253059073>";

	public static String returnIcon(String item) {

		String response = "";
		switch (item) {
			case "Fuego":
				response = FIRE;
				break;
			case "Plaga de fuego":
				response = FIRE;
				break;
			case "Fuego(Parte delantera)":
				response = FIREARZ;
				break;
			case "Fuego(Sin lodo)":
				response = FIREBA;
				break;
			case "Fuego(Con nieve)":
				response = FIREBAES;
				break;
			case "Fuego(Con hielo)":
				response = FIREAGGL;
				break;
			case "Fuego(Volando)":
				response = FIREALA;
				break;
			case "Hielo":
				response = ICE;
				break;
			case "Plaga de hielo":
				response = ICE;
				break;
			case "Hielo(Parte trasera)":
				response= ICEARZ;
				break;
			case "Hielo(Posado)":
				response= ICEALA;
				break;
			case "Hielo(Modo armadura)":
				response= ICEMI;
				break;
			case "Trueno":
				response = THUNDER;
				break;
			case "Plaga de trueno":
				response = THUNDER;
				break;
			case "Trueno(Sin nieve)":
				response = THUNDERBAES;
				break;
			case "Agua":
				response = WATER;
				break;
			case "Plaga de agua":
				response = WATER;
				break;
			case "Agua(Con lodo)":
				response = WATERBA;
				break;
			case "Agua(Con lava)":
				response = WATERAG;
				break;
			case "Agua(Posado)":
				response = WATERALA;
				break;
			case "Dragon":
				response = DRAGON;
				break;
			case "Plaga de dragon":
				response = DRAGON;
				break;
			case "Dragon(Sin lava)":
				response = DRAGONAG;
				break;
			case "Dragon(Sin hielo)":
				response = DRAGONAGGL;
				break;
			case "Dragon(Volando)":
				response = DRAGONALA;
				break;
			case "Paralisis":
				response = PARALISIS;
				break;
			case "Sueño":
				response = SLEEP;
				break;
			case "Sueño(Rango G)":
				response = SLEEPQU;
				break;
			case "Muñeco de nieve":
				response = SNOWMAN;
				break;
			case "Hedor":
				response = SOIL;
				break;
			case "Lodo":
				response = MUDMAN;
				break;
			case "Aturdimiento":
				response = STUN;
				break;
			case "Reduccion de defensa":
				response = DEFENSEDOWN;
				break;
			case "Mineral":
				response = ORE;
				break;
			case "Plantas":
				response = HERB;
				break;
			case "Cascara":
				response = HUSK;
				break;
			case "Miel":
				response = HONEY;
				break;
			case "Telaraña":
				response = WEB;
				break;
			case "Piedra de afilar":
				response = WHETSTONE;
				break;
			case "Pesca":
				response = FISH;
				break;
			case "Bayas":
				response = SEED;
				break;
			case "Boñiga":
				response = DUNG;
				break;
			case "Desconocido":
				response = UNKNOWN;
				break;
			case "Cebo":
				response = BAIT;
				break;
			case "Huesos":
				response = BONE;
				break;
			case "Setas":
				response = MUSHROM;
				break;
			case "Insectos":
				response = BUG;
				break;
			case "Zona Secreta":
				response = SECRETZONE;
				break;
		}
		return response;

	}

}
