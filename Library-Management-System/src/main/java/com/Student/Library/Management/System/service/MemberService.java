package com.Student.Library.Management.System.service;

import com.Student.Library.Management.System.Model.Members;
import com.Student.Library.Management.System.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;
    public List<Members> get_memberDetails(){
        List<Members> details=memberRepository.findAll();
        return details;
    }

    public Members get_memberById(int memberId){
        Members Id=memberRepository.findBymemberId(memberId);
        return Id;
    }

    public Members get_membername(String mName){
            Members name=memberRepository.findBymName(mName);
            return name;
    }

    public void add_new_member(Members newmember){
        memberRepository.save(newmember);
    }

    public void updateMember(int memberId, Members newMemberDetails){
        Members oldDetails=memberRepository.findBymemberId(memberId);
        oldDetails.setMname(newMemberDetails.getMname());
        memberRepository.save(oldDetails);
    }


    public void remove_member(int memberId){
        memberRepository.deleteById(memberId);
    }
}
