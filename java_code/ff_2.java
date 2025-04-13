/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
 * Renamed from fF
 */
public final class ff_2
extends GeneratedMessageV3
implements fj_2 {
    private static final long d = 0L;
    public static final int a = 1;
    MapField<Integer, fz_1> e;
    public static final int b = 2;
    List<Long> f;
    private byte g = (byte)-1;
    private static final ff_2 h = new ff_2();
    @Deprecated
    public static final Parser<ff_2> c = new fg_2();

    ff_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ff_2() {
        this.f = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ff_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block12;
                        bl = true;
                        continue block12;
                    }
                    case 10: {
                        if ((n & 1) != 1) {
                            this.e = MapField.newMapField(fi_2.a);
                            n |= 1;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(fi_2.a.getParserForType(), extensionRegistryLite);
                        this.e.getMutableMap().put((Integer)mapEntry.getKey(), (fz_1)mapEntry.getValue());
                        continue block12;
                    }
                    case 16: {
                        if ((n & 2) != 2) {
                            this.f = new ArrayList<Long>();
                            n |= 2;
                        }
                        this.f.add(codedInputStream.readInt64());
                        continue block12;
                    }
                    case 18: 
                }
                int n3 = codedInputStream.readRawVarint32();
                int n4 = codedInputStream.pushLimit(n3);
                if ((n & 2) != 2 && codedInputStream.getBytesUntilLimit() > 0) {
                    this.f = new ArrayList<Long>();
                    n |= 2;
                }
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    this.f.add(codedInputStream.readInt64());
                }
                codedInputStream.popLimit(n4);
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 2) == 2) {
                this.f = Collections.unmodifiableList(this.f);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return fr_1.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.n();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fr_1.b.ensureFieldAccessorsInitialized(ff_2.class, fh_2.class);
    }

    MapField<Integer, fz_1> n() {
        if (this.e == null) {
            return MapField.emptyMapField(fi_2.a);
        }
        return this.e;
    }

    @Override
    public int b() {
        return this.n().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.n().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, fz_1> c() {
        return this.d();
    }

    @Override
    public Map<Integer, fz_1> d() {
        return this.n().getMap();
    }

    @Override
    public fz_1 a(int n, fz_1 fz_12) {
        Map map = this.n().getMap();
        return map.containsKey(n) ? (fz_1)map.get(n) : fz_12;
    }

    @Override
    public fz_1 b(int n) {
        Map map = this.n().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (fz_1)map.get(n);
    }

    @Override
    public List<Long> e() {
        return this.f;
    }

    @Override
    public int f() {
        return this.f.size();
    }

    @Override
    public long c(int n) {
        return this.f.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.g;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (fz_1 fz_12 : this.d().values()) {
            if (fz_12.isInitialized()) continue;
            this.g = 0;
            return false;
        }
        this.g = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.n(), fi_2.a, (int)1);
        for (int k = 0; k < this.f.size(); ++k) {
            codedOutputStream.writeInt64(2, this.f.get(k).longValue());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.n().getMap().entrySet()) {
            MapEntry mapEntry = fi_2.a.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((fz_1)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        int n2 = 0;
        for (int k = 0; k < this.f.size(); ++k) {
            n2 += CodedOutputStream.computeInt64SizeNoTag((long)this.f.get(k));
        }
        n += n2;
        n += 1 * this.e().size();
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ff_2)) {
            return super.equals(object);
        }
        ff_2 ff_22 = (ff_2)object;
        boolean bl = true;
        bl = bl && this.n().equals(ff_22.n());
        bl = bl && this.e().equals(ff_22.e());
        bl = bl && this.unknownFields.equals((Object)ff_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ff_2.a().hashCode();
        if (!this.n().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.n().hashCode();
        }
        if (this.f() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ff_2 a(ByteBuffer byteBuffer) {
        return (ff_2)c.parseFrom(byteBuffer);
    }

    public static ff_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ff_2 a(ByteString byteString) {
        return (ff_2)c.parseFrom(byteString);
    }

    public static ff_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ff_2 a(byte[] byArray) {
        return (ff_2)c.parseFrom(byArray);
    }

    public static ff_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ff_2 a(InputStream inputStream) {
        return (ff_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ff_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ff_2 b(InputStream inputStream) {
        return (ff_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ff_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ff_2 a(CodedInputStream codedInputStream) {
        return (ff_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ff_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ff_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fh_2 g() {
        return ff_2.h();
    }

    public static fh_2 h() {
        return h.i();
    }

    public static fh_2 a(ff_2 ff_22) {
        return h.i().a(ff_22);
    }

    public fh_2 i() {
        return this == h ? new fh_2() : new fh_2().a(this);
    }

    protected fh_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        fh_2 fh_22 = new fh_2(builderParent);
        return fh_22;
    }

    public static ff_2 j() {
        return h;
    }

    public static Parser<ff_2> k() {
        return c;
    }

    public Parser<ff_2> getParserForType() {
        return c;
    }

    public ff_2 l() {
        return h;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    static /* synthetic */ boolean m() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ff_2 ff_22) {
        return ff_22.unknownFields;
    }
}

