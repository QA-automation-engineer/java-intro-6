package lesson12;

import java.util.Comparator;

/**
 * Created by Vladimir Trandafilov on 01.11.2019.
 */
public class PhonesComparator implements Comparator<Phone> {

	@Override
	public int compare(Phone o1, Phone o2) {
		return o1.getCompany().toUpperCase().compareTo( o2.getCompany().toUpperCase() );
	}
}
