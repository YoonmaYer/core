package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // 인터페이스를 의존하는 동시에 구현체까지 의존하는 코드. DIP 위반.
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
    memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
