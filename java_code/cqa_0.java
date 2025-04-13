/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cqA
 */
public final class cqa_0
extends Pw {
    private final long a;

    public cqa_0(long l) {
        this.a = l;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12879;
    }

    @Override
    public String toString() {
        return "ChallengeInformationRequestMessage{m_characterId=" + this.a + "}";
    }
}

