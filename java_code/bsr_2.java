/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  org.jetbrains.annotations.Nullable
 */
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSr
 */
public class bsr_2 {
    @SerializedName(value="hide")
    @Nullable
    private Boolean a;
    @SerializedName(value="containsCompanion")
    @Nullable
    private Boolean b;

    public boolean a() {
        if (this.a != null && this.a.booleanValue()) {
            return false;
        }
        return this.b == null || this.b == false || enp_2.a.d(ens_2.al);
    }

    @Nullable
    public Boolean b() {
        return this.a;
    }

    @Nullable
    public Boolean c() {
        return this.b;
    }

    public String toString() {
        return "ShopInGameRequirement(m_hide=" + this.b() + ", m_containsCompanion=" + this.c() + ")";
    }
}

