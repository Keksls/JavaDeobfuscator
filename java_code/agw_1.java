/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from aGW
 */
public class agw_1
extends agm_1 {
    protected static final Logger h = Logger.getLogger(agw_1.class);
    private int i;
    private ago_1 j;
    private agp_1 k;
    private agr_1 l;
    private agp_1 m;
    private final List<agk_1> n = new ArrayList<agk_1>();
    private final List<agk_1> o = new ArrayList<agk_1>();

    public agw_1(agn_1 agn_12, ResultSet resultSet) {
        super(agn_12, resultSet.getString("conname"), resultSet.getLong("oid"));
        String string = resultSet.getString("contype").toLowerCase();
        if (string.equals("c")) {
            this.i = 1;
        } else if (string.equals("f")) {
            this.i = 2;
        } else if (string.equals("p")) {
            this.i = 3;
        } else if (string.equals("u")) {
            this.i = 4;
        }
        this.j = agn_12.c(resultSet.getLong("connamespace"));
        if (this.j != null) {
            this.k = this.j.a(resultSet.getLong("conrelid"));
            if (this.k != null) {
                this.k.a(this);
            }
        }
        this.l = agn_12.d(resultSet.getLong("contypid"));
        if (this.i == 2 && this.j != null) {
            this.m = this.j.a(resultSet.getLong("confrelid"));
        }
        if (this.k != null) {
            int[] nArray;
            int[] nArray2 = (int[])resultSet.getArray("conkey").getArray();
            if (nArray2 != null) {
                nArray = nArray2;
                int n = nArray.length;
                for (int k = 0; k < n; ++k) {
                    int n2 = nArray[k];
                    agk_1 agk_12 = this.k.a(n2);
                    if (agk_12 == null) {
                        h.error((Object)("Invalid key : " + n2));
                        break;
                    }
                    this.n.add(agk_12);
                }
            }
            if (this.i == 2 && (nArray = (int[])resultSet.getArray("confkey").getArray()) != null) {
                for (int n : nArray) {
                    agk_1 agk_13 = this.k.a(n);
                    if (agk_13 == null) {
                        h.error((Object)("Invalid key : " + n));
                        break;
                    }
                    this.o.add(agk_13);
                }
            }
        }
    }

    @Override
    public int a() {
        return this.i;
    }

    public ago_1 b() {
        return this.j;
    }

    public agp_1 c() {
        return this.k;
    }

    public agr_1 d() {
        return this.l;
    }

    public agp_1 e() {
        return this.m;
    }

    public List<agk_1> f() {
        return this.n;
    }

    public List<agk_1> g() {
        return this.o;
    }
}

