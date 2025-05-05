package Exercise48;

import java.util.List;
import java.util.ArrayList;

// ISaveable interface
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}