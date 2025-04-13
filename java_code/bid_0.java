/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bId
 */
public class bid_0
extends bgz_0 {
    public static final String w = "stackInventory";
    public static final String x = String.format("%s.%s", "collapsedView", "stackInventory");
    private final String y;
    private final String z;
    private List<bHR> A = new ArrayList<bHR>();

    public bid_0(String string) {
        this.y = string;
        this.i();
        this.l();
        this.z = bae.h().a(this.y, new Object[0]);
    }

    @Override
    public String[] d() {
        return q;
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "bagName": 
            case "bagNameSize": {
                return this.z;
            }
            case "bagInventory": {
                return this.A;
            }
            case "bagSize": {
                return this.A.size();
            }
            case "canBeSorted": {
                return false;
            }
            case "collapsingIgnoreSize": {
                return false;
            }
            case "collapsible": {
                return true;
            }
        }
        return super.b(string);
    }

    public void a(List<bHR> list) {
        this.A = list;
    }

    @Override
    protected ags_0 b() {
        return ags_0.c;
    }

    @Override
    protected String e() {
        return String.format("%s.%s", x, this.y);
    }
}

