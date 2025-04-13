/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eOQ
 */
public class eoq_1 {
    private final fat<eok_1> a = new fat();
    private final int b;
    private final short c;
    private final short d;

    public eoq_1(int n, short s2, short s3) {
        this.b = n;
        this.c = s2;
        this.d = s3;
    }

    public void a(eok_1 eok_12) {
        this.a.a(eok_12);
    }

    public int a() {
        return this.b;
    }

    public short b() {
        return this.c;
    }

    public short c() {
        return this.d;
    }

    public eok_1 a(Object object, Object object2, Object object3, Object object4) {
        return this.a.a(object, object2, object3, object4);
    }

    public String toString() {
        return "FightChallengeMonsterDefinition{m_dropTable=" + this.a + ", m_monsterId=" + this.b + ", m_randomRolls=" + this.c + ", m_forcedRolls=" + this.d + "}";
    }
}

