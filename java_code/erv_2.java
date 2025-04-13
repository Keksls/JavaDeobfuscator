/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.gson.annotations.SerializedName
 */
import com.google.common.collect.ImmutableList;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from erv
 */
public class erv_2 {
    @SerializedName(value="proxies")
    private final Collection<eru_2> a = new ArrayList<eru_2>();

    public List<eru_2> a() {
        return ImmutableList.copyOf(this.a);
    }

    public String toString() {
        return "ProxyArray{m_proxies=" + this.a.size() + "}";
    }
}

