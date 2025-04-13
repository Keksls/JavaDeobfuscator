/*
 * Decompiled with CFR 0.152.
 */
public class cqH
extends Pw {
    private final int a;
    private final long b;
    private final int c;

    public cqH(long l, int n, int n2) {
        this.a = n;
        this.b = l;
        this.c = n2;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 13152;
    }

    @Override
    public String toString() {
        return "RemoveSpellToDeckRequestMessage{m_spellId=" + this.a + ", m_playerId=" + this.b + ", m_deckIndex=" + this.c + "}";
    }
}

