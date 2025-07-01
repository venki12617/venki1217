package com.Student.Library.Management.System.Repository;

import com.Student.Library.Management.System.Model.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Members,Integer> {
public Members findBymemberId(int memberId);
public Members findBymName(String mName);
}
