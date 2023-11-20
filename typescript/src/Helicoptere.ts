import { Direction } from './Direction'
import { ModuleMartien } from './ModuleMartien'
import { Position } from './Position'
import { Rover } from './Rover'

export class Helicoptere extends Rover implements ModuleMartien {
  constructor(override readonly direction: Direction, override readonly position: Position) {
    super(direction, position);
  }

  override monter() {
    super._position = new Position(this._position.x, this._position.y, this._position.z + 1);
  }

  override descendre() {
    super._position = new Position(this._position.x, this._position.y, this._position.z - 1);
  }
}
