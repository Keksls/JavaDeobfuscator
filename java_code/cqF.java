/*
 * Decompiled with CFR 0.152.
 */
public class cqF
extends Pw {
    private final int a;
    private final long b;
    private final int c;
    private final int e;

    public cqF(long l, int n, int n2, int n3) {
        this.a = n;
        this.b = l;
        this.c = n2;
        this.e = n3;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c);
        abx_22.a(this.e);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12159;
    }

    @Override
    public String toString() {
        return "AddSpellToDeckRequestMessage{m_spellId=" + this.a + ", m_playerId=" + this.b + ", m_deckIndex=" + this.c + ", m_slotIndex=" + this.e + "}";
    }
}

