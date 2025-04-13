/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * Renamed from eWj
 */
public class ewj_1
extends AbstractTableModel {
    private final ArrayList<String[]> a = new ArrayList();
    private final String[] b = new String[]{"logLevel", "serverId", "date", "accountFrom", "characterFrom", "accountTo", "characterTo", "ipFrom", "ipTo", "type", "externalId", "instanceId", "itemRefId", "itemFromUid", "itemToUId", "quantity", "kamas"};

    @Override
    public int getRowCount() {
        return this.a.size();
    }

    @Override
    public int getColumnCount() {
        return this.b.length;
    }

    @Override
    public String getColumnName(int n) {
        return this.b[n];
    }

    @Override
    public Object getValueAt(int n, int n2) {
        return this.a.get(n)[n2];
    }

    public void a(String[] stringArray) {
        this.a.add(stringArray);
        this.fireTableRowsInserted(this.a.size() - 1, this.a.size() - 1);
    }

    public void a(int n) {
        this.a.remove(n);
        this.fireTableRowsDeleted(n, n);
    }

    public void a() {
        if (this.a.isEmpty()) {
            return;
        }
        int n = this.a.size();
        this.a.clear();
        this.fireTableRowsDeleted(0, n - 1);
    }
}

