package mars;

public interface ModuleMartien {

	Position getPosition();

	void avancer();

	void reculer();

	void monter();

	void descendre();

	void activerRecuperation();

	boolean isPretPourRecuperation();
}