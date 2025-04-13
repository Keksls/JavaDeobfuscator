/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;

public abstract class ceg {
    @SerializedName(value="server_id")
    private final int a = enp_2.a.b(ens_2.ay);
    @SerializedName(value="character_account_id")
    private long b;
    @SerializedName(value="character_id")
    private long c;
    @SerializedName(value="date")
    private String d;

    protected ceg() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.d = simpleDateFormat.format(wc_0.p().getTime());
    }

    public static cee a(cec cec2, Object ... objectArray) {
        bmr_1 bmr_12 = azu_0.j().k();
        ceg ceg2 = cec2.a();
        ceg2.a(bmr_12);
        ceg2.a(objectArray);
        cee cee2 = new cee(cec2.b());
        cee2.a(ceg2);
        cee2.a(azu_0.j().n().o());
        return cee2;
    }

    protected void a(bmr_1 bmr_12) {
        if (bmr_12 != null) {
            this.b = bmr_12.U_();
            this.c = bmr_12.a_();
        } else {
            this.b = azu_0.j().n().u();
            this.c = -1L;
        }
    }

    protected abstract void a(Object[] var1);
}

