package S11.Interfaces;

import java.util.List;

/**
 *
 * @author 27605(Muhammed Gardee)
 */

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
