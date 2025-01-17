package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     */
    public boolean addRecord(FroggerID froggerID) {
        for (FroggerID existingRecord : this.records) {
            if (existingRecord.equals(froggerID)) {
                return false; // Record already exists
            }
        }
        this.records.add(froggerID); // Add new record
        return true;
    }
}