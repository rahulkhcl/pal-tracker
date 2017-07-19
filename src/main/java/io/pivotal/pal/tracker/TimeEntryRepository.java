package io.pivotal.pal.tracker;
import java.util.List;

/**
 * Created by Rahulka on 19-07-2017.
 */
public interface TimeEntryRepository {
    TimeEntry create(TimeEntry timeEntry);
    TimeEntry get(Long id);
    List<TimeEntry> list();
    TimeEntry update(Long id, TimeEntry timeEntry);
    void delete(Long id);
}
