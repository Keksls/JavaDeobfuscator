/*
 * Decompiled with CFR 0.152.
 */
public class fhh {
    private final fho a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public fhh(fho fho2, int n, int n2, int n3, int n4, int n5) {
        this.a = fho2;
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.f = n5;
    }

    public fho a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public String toString() {
        return "BattlegroundGameplayData{m_type=" + this.a + ", m_scenarioId=" + this.b + ", m_instanceId=" + this.c + ", m_teleporterAttack=" + this.d + ", m_teleporterDefense=" + this.e + ", m_gameplayTerritoryId=" + this.f + "}";
    }
}

