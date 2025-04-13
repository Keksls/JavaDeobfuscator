/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fAb
 */
public interface fab_1
extends fai_2 {
    public void removeValue(Object var1);

    public void addValue(Object var1);

    public boolean addValue(int var1, Object var2);

    public int addValue(Object var1, Object var2);

    public boolean replaceValue(Object var1, Object var2);

    public Object getValue(int var1);

    public int getTableIndex(ftj_0 var1);

    public int getItemIndex(Object var1);

    public ArrayList<ftj_0> getRenderables();

    public int size();

    default public boolean e() {
        return this.size() == 0;
    }
}

