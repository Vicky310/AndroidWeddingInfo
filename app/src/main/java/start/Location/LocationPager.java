package start.Location;




import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


//Extending FragmentStatePagerAdapter
public class LocationPager extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public LocationPager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount = tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                LocationInfoFrag loc = new LocationInfoFrag();
                return loc;
//            case 1:
//                MapsActivity Mapsactivity = new MapsActivity();
//                return Mapsactivity;

            default:
                return null;
        }

    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }

   /* @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0 :
                return "AJ Styles";
            case 1 :
                return "Dean Ambrose";
            case 2 :
                return "John Cena";
            case 3 :
                return "Cesaro";
        }
        return null;
    }*/

}
