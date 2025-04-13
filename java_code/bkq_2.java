/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bkq
 */
public class bkq_2
implements ajh_1 {
    public static final String a = "sheetCode";
    private static final String[] b = new String[]{"sheetCode"};
    private final byte d;
    private final ezx_2 e;

    public bkq_2(byte by, ezx_2 ezx_22) {
        this.d = by;
        this.e = ezx_22;
    }

    @Override
    public String[] d() {
        return b;
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "sheetCode": {
                return bkp_2.a(this.e);
            }
        }
        return null;
    }

    public boolean a(bmr_1 bmr_12) {
        return this.e.a(bmr_12);
    }

    public <T extends ezx_2> T a() {
        return (T)this.e;
    }

    public byte b() {
        return this.d;
    }
}

