/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from eUg
 */
public class eug_2
implements TObjectProcedure<ese_1> {
    private int a = 3;
    private int b = 3;

    public boolean a(ese_1 ese_12) {
        this.a -= ese_12.a().e();
        this.a += ese_12.a().f();
        this.b += ese_12.a().f();
        return true;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        return "WorkerBuildingCount{m_remainingWorker=" + this.a + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((ese_1)object);
    }
}

