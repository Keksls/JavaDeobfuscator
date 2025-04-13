/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.awt.Dimension;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import org.apache.commons.pool.ObjectPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from fIH
 */
public class fih_1
extends fig_2
implements abq_1 {
    private static final Logger g = LoggerFactory.getLogger(fih_1.class);
    public static final String TAG = "WrappableLayout";
    public static final String a = "wl";
    private static final ObjectPool h = new abm_1(new fii_1(), 2000);
    private boolean i = true;
    private short j = 0;
    private short k = 0;
    private frs_0 l = frs_0.e;
    public static final int b = 3200366;
    public static final int d = 3617440;
    public static final int e = 1387629604;
    public static final int f = 92903173;

    public static fih_1 checkOut() {
        fih_1 fih_12;
        try {
            fih_12 = (fih_1)h.borrowObject();
            fih_12.m_currentPool = h;
        }
        catch (Exception exception) {
            g.error("Error occured during onCheckOut/borrowObject", (Throwable)exception);
            fih_12 = new fih_1();
            fih_12.onCheckOut();
        }
        return fih_12;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean isHorizontal() {
        return this.i;
    }

    public void setHorizontal(boolean bl) {
        this.i = bl;
    }

    public short getHgap() {
        return this.j;
    }

    public void setHgap(short s2) {
        this.j = s2;
    }

    public short getVgap() {
        return this.k;
    }

    public void setVgap(short s2) {
        this.k = s2;
    }

    public frs_0 getAlign() {
        return this.l;
    }

    public void setAlign(frs_0 frs_02) {
        this.l = frs_02;
    }

    protected Map<List<fvE>, fjf_2> getWidgetsAndDimensionPerRow(int n, int n2, List<fvE> list, Function<fvE, fjf_2> function) {
        boolean bl = this.isHorizontal();
        int n3 = 0;
        int n4 = 0;
        LinkedHashMap<List<fvE>, fjf_2> linkedHashMap = new LinkedHashMap<List<fvE>, fjf_2>();
        LinkedList<fvE> linkedList = new LinkedList<fvE>();
        boolean bl2 = true;
        for (fvE fvE2 : list) {
            boolean bl3;
            short s2;
            if (!fvE2.getVisible()) continue;
            fjf_2 fjf_22 = function.apply(fvE2);
            if (bl2) {
                bl2 = false;
                s2 = 0;
            } else {
                short s3 = s2 = bl ? this.j : this.k;
            }
            if (bl) {
                bl3 = n3 + s2 + fjf_22.width <= n2;
            } else {
                boolean bl4 = bl3 = n4 + s2 + fjf_22.height <= n;
            }
            if (!bl3) {
                linkedHashMap.put(new LinkedList(linkedList), new fjf_2(n3, n4));
                n4 = 0;
                n3 = 0;
                bl2 = true;
                linkedList.clear();
            }
            linkedList.add(fvE2);
            if (bl) {
                n3 += s2 + fjf_22.width;
                n4 = Math.max(n4, fjf_22.height);
                continue;
            }
            n3 = Math.max(n3, fjf_22.width);
            n4 += s2 + fjf_22.height;
        }
        if (!linkedList.isEmpty()) {
            linkedHashMap.put(new LinkedList(linkedList), new fjf_2(n3, n4));
            linkedList.clear();
        }
        return linkedHashMap;
    }

    protected int getMaxOfAxes(Map<List<fvE>, fjf_2> map, ToDoubleFunction<fjf_2> toDoubleFunction) {
        return (int)map.values().stream().mapToDouble(toDoubleFunction).max().orElse(0.0);
    }

    protected int getSumOfAxes(Map<List<fvE>, fjf_2> map, ToDoubleFunction<fjf_2> toDoubleFunction, Supplier<Short> supplier) {
        int n = map.size();
        return (int)map.values().stream().mapToDouble(toDoubleFunction).sum() + (n > 1 ? (n - 1) * supplier.get() : 0);
    }

    protected fjf_2 getContentSize(fso fso2, fjf_2 fjf_22, Function<fvE, fjf_2> function) {
        int n;
        int n2;
        if (fjf_22 == null) {
            fjf_22 = new fjf_2(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        Map<List<fvE>, fjf_2> map = this.getWidgetsAndDimensionPerRow(fjf_22.height, fjf_22.width, fso2.getWidgetChildren(), function);
        if (this.isHorizontal()) {
            n2 = this.getMaxOfAxes(map, Dimension::getWidth);
            n = this.getSumOfAxes(map, Dimension::getHeight, () -> this.k);
        } else {
            n2 = this.getSumOfAxes(map, Dimension::getWidth, () -> this.j);
            n = this.getMaxOfAxes(map, Dimension::getHeight);
        }
        return new fjf_2(n2, n);
    }

    protected fjf_2 getContentSize(fso fso2, Function<fso, fjf_2> function, Function<fvE, fjf_2> function2) {
        return this.getContentSize(fso2, function.apply(fso2), function2);
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        return this.getContentSize(fso2, fvE::getSpecifiedContentMinSize, fvE::getMinSize);
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        return this.getContentSize(fso2, fvE::getSpecifiedContentPrefSize, fvE::getPrefSize);
    }

    @Override
    public void a(fso fso2) {
        int n;
        int n2;
        fjf_2 fjf_22 = fso2.getAppearance().getContentSize();
        int n3 = fjf_22.height;
        int n4 = fjf_22.width;
        fjf_2 fjf_23 = this.getContentSize(fso2, fjf_22, fvE::getPrefSize);
        Function<fvE, fjf_2> function = fjf_23.height <= n3 && fjf_23.width <= n4 ? fvE::getPrefSize : fvE::getMinSize;
        Map<List<fvE>, fjf_2> map = this.getWidgetsAndDimensionPerRow(n3, n4, fso2.getWidgetChildren(), function);
        boolean bl = this.isHorizontal();
        frs_0 frs_02 = this.getAlign();
        if (bl) {
            n2 = this.getSumOfAxes(map, Dimension::getHeight, () -> this.k);
            n = frs_02.b(n2, n3) + n2;
        } else {
            n2 = this.getSumOfAxes(map, Dimension::getWidth, () -> this.j);
            n = frs_02.a(n2, n4);
        }
        n2 = 1;
        for (Map.Entry<List<fvE>, fjf_2> entry : map.entrySet()) {
            int n5;
            int n6;
            fjf_2 fjf_24 = entry.getValue();
            if (bl) {
                n6 = frs_02.a(fjf_24.width, n4);
            } else {
                n5 = fjf_24.height + (n2 != 0 ? (short)0 : this.k);
                n6 = frs_02.b(n5, n3) + n5;
            }
            if (bl) {
                n -= fjf_24.height + (n2 != 0 ? (short)0 : this.k);
            }
            n5 = 1;
            for (fvE fvE2 : entry.getKey()) {
                int n7;
                fjf_2 fjf_25 = function.apply(fvE2);
                fvE2.setSize(fjf_25);
                if (bl) {
                    n7 = n + frs_02.b(fjf_25.height, fjf_24.height);
                    fvE2.setPosition(n6, n7);
                    n6 += fjf_25.width + this.j;
                } else {
                    n7 = n + frs_02.a(fjf_25.width, fjf_24.width);
                    fvE2.setPosition(n7, n6 -= fjf_25.height);
                    n6 -= this.k;
                }
                if (n5 == 0) continue;
                n5 = 0;
            }
            if (!bl) {
                n += fjf_24.width + this.j;
            }
            if (n2 == 0) continue;
            n2 = 0;
        }
    }

    @Override
    public void copyElement(fyo fyo2) {
        fih_1 fih_12 = (fih_1)fyo2;
        super.copyElement(fih_12);
        fih_12.setHorizontal(this.isHorizontal());
        fih_12.setHgap(this.getHgap());
        fih_12.setVgap(this.getVgap());
        fih_12.setAlign(this.getAlign());
    }

    public fih_1 a() {
        fih_1 fih_12 = fih_1.checkOut();
        this.copyElement(fih_12);
        return fih_12;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.i = true;
        this.j = 0;
        this.k = 0;
        this.l = frs_0.e;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        switch (n) {
            case 3200366: {
                this.setHgap(Co.h(string));
                return true;
            }
            case 3617440: {
                this.setVgap(Co.h(string));
                return true;
            }
            case 1387629604: {
                this.setHorizontal(Co.a(string));
                return true;
            }
            case 92903173: {
                this.setAlign(frs_0.a(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public /* synthetic */ fig_2 d() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.a();
    }
}

