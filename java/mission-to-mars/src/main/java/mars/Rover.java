package mars;

import lombok.Getter;

public class Rover implements ModuleMartien {

	private Direction direction;
	@Getter
	protected Position position;
	@Getter
	private boolean pretPourRecuperation = false;

	public Rover(Direction direction, Position position) {
		this.direction = direction;
		this.position = position;
	}

	public void avancer() {
		switch (direction) {
		case NORD:
			position = new Position(position.getX(), position.getY() + 1, position.getZ());
			break;
		case SUD:
			position = new Position(position.getX(), position.getY() - 1, position.getZ());
			break;
		case OUEST:
			position = new Position(position.getX() - 1, position.getY(), position.getZ());
			break;
		default:
			position = new Position(position.getX() + 1, position.getY(), position.getZ());
		}
	}

	public void reculer() {
		switch (direction) {
		case NORD:
			position = new Position(position.getX(), position.getY() - 1, position.getZ());
			break;
		case SUD:
			position = new Position(position.getX(), position.getY() + 1, position.getZ());
			break;
		case OUEST:
			position = new Position(position.getX() + 1, position.getY(), position.getZ());
			break;
		default:
			position = new Position(position.getX() - 1, position.getY(), position.getZ());
		}
	}

	@Override
	public void monter() {
		throw new UnsupportedOperationException("Un rover ne vole pas");
	}

	@Override
	public void descendre() {
		throw new UnsupportedOperationException("Un rover ne vole pas");
	}

	public void activerRecuperation() {
		pretPourRecuperation = true;
	}

}