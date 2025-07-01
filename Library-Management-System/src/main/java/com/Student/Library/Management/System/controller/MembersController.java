package com.Student.Library.Management.System.controller;

import com.Student.Library.Management.System.Model.Members;
import com.Student.Library.Management.System.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Members")
public class MembersController {
@Autowired
    MemberService memberService;
@GetMapping("getAllMembers")
    public List<Members> get_memberdetails(){
    return memberService.get_memberDetails();
}
@GetMapping("getById/{memberId}")
public  Members getId(@PathVariable int memberId){
    return memberService.get_memberById(memberId);
}
@GetMapping("getByName/{mName}")
public Members get_Membername(@PathVariable String mName){
   return memberService.get_membername(mName);
}
@PostMapping("addnew")
    public String add_member(@RequestBody Members newmember){
    memberService.add_new_member(newmember);
    return "new member added with id :"+newmember.getMemberId();
}


@PutMapping("UpdateMember/{memberId}")
public String updateMember(@PathVariable int memberId,@RequestBody Members newMemberDetails){
    memberService.updateMember(memberId,newMemberDetails);
    return "Updated MemberDetails having id :"+newMemberDetails.getMemberId();
}


@DeleteMapping("DeleteMember/{memberId}")
    public String remove_member(@PathVariable int memberId){
    memberService.remove_member(memberId);
    return "member removed having id :"+memberId;
}


}
