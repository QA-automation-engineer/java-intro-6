package lesson09.cellable_person_with_generics;

/**
 * Created by Vladimir Trandafilov on 16.10.2019.
 */
public abstract class BaseCell implements Cell {

	protected String model;

	public BaseCell(String model) {
		this.model = model;
	}

	@Override
	public String getCellModel() {
		return model;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		BaseCell baseCell = (BaseCell) o;

		return model != null ? model.equals(baseCell.model) : baseCell.model == null;
	}

	@Override
	public int hashCode() {
		return model != null ? model.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "BaseCell{" + "model='" + model + '\'' + '}';
	}
}
