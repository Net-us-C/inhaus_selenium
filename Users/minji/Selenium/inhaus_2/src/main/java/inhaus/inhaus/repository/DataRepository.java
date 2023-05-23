package inhaus.inhaus.repository;

import inhaus.inhaus.data.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
    //@Override
    //Optional<Data> findByMonthAndDay(int month, int day);

    // 혹시 나중에 쓰일지 몰라서 일단 주석처리 해놓은 코드.
//    Optional<Data> findBymonth(int month);
    Optional<Data> findByDay(int day);

//    Optional<Data> findBystart_time(String startTime);
//    Optional<Data> findByend_time(String endTime);
//    Optional<Data> findBycontents(String contents);
}
