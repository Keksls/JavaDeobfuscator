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
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$ListAdapter
 *  com.google.protobuf.Internal$ListAdapter$Converter
 *  com.google.protobuf.InvalidProtocolBufferException
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
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

/*
 * Renamed from Bk
 */
public final class bk_0
extends GeneratedMessageV3
implements Bp {
    private static final long h = 0L;
    int i;
    public static final int a = 1;
    long j;
    public static final int b = 2;
    long k;
    public static final int c = 3;
    List<Integer> l;
    static final Internal.ListAdapter.Converter<Integer, bj_0> m = new Bl();
    public static final int d = 4;
    List<Integer> n;
    static final Internal.ListAdapter.Converter<Integer, bq_0> o = new bm_0();
    public static final int e = 5;
    int p;
    public static final int f = 6;
    boolean q;
    private byte r = (byte)-1;
    private static final bk_0 s = new bk_0();
    @Deprecated
    public static final Parser<bk_0> g = new bn_0();

    bk_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bk_0() {
        this.j = 0L;
        this.k = 0L;
        this.l = Collections.emptyList();
        this.n = Collections.emptyList();
        this.p = 0;
        this.q = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bk_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block17: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block17;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block17;
                        bl = true;
                        continue block17;
                    }
                    case 8: {
                        this.i |= 1;
                        this.j = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 16: {
                        this.i |= 2;
                        this.k = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 24: {
                        int n3 = codedInputStream.readEnum();
                        bj_0 bj_02 = bj_0.a(n3);
                        if (bj_02 == null) {
                            builder.mergeVarintField(3, n3);
                            continue block17;
                        }
                        if ((n & 4) != 4) {
                            this.l = new ArrayList<Integer>();
                            n |= 4;
                        }
                        this.l.add(n3);
                        continue block17;
                    }
                    case 26: {
                        Enum enum_;
                        int n4;
                        int n3 = codedInputStream.readRawVarint32();
                        int n5 = codedInputStream.pushLimit(n3);
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            n4 = codedInputStream.readEnum();
                            enum_ = bj_0.a(n4);
                            if (enum_ == null) {
                                builder.mergeVarintField(3, n4);
                                continue;
                            }
                            if ((n & 4) != 4) {
                                this.l = new ArrayList<Integer>();
                                n |= 4;
                            }
                            this.l.add(n4);
                        }
                        codedInputStream.popLimit(n5);
                        continue block17;
                    }
                    case 32: {
                        int n3 = codedInputStream.readEnum();
                        bq_0 bq_02 = bq_0.a(n3);
                        if (bq_02 == null) {
                            builder.mergeVarintField(4, n3);
                            continue block17;
                        }
                        if ((n & 8) != 8) {
                            this.n = new ArrayList<Integer>();
                            n |= 8;
                        }
                        this.n.add(n3);
                        continue block17;
                    }
                    case 34: {
                        Enum enum_;
                        int n4;
                        int n3 = codedInputStream.readRawVarint32();
                        int n6 = codedInputStream.pushLimit(n3);
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            n4 = codedInputStream.readEnum();
                            enum_ = bq_0.a(n4);
                            if (enum_ == null) {
                                builder.mergeVarintField(4, n4);
                                continue;
                            }
                            if ((n & 8) != 8) {
                                this.n = new ArrayList<Integer>();
                                n |= 8;
                            }
                            this.n.add(n4);
                        }
                        codedInputStream.popLimit(n6);
                        continue block17;
                    }
                    case 40: {
                        this.i |= 4;
                        this.p = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 48: 
                }
                this.i |= 8;
                this.q = codedInputStream.readBool();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 4) == 4) {
                this.l = Collections.unmodifiableList(this.l);
            }
            if ((n & 8) == 8) {
                this.n = Collections.unmodifiableList(this.n);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return AO.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.l.ensureFieldAccessorsInitialized(bk_0.class, bo_0.class);
    }

    @Override
    public boolean b() {
        return (this.i & 1) == 1;
    }

    @Override
    public long c() {
        return this.j;
    }

    @Override
    public boolean d() {
        return (this.i & 2) == 2;
    }

    @Override
    public long e() {
        return this.k;
    }

    @Override
    public List<bj_0> f() {
        return new Internal.ListAdapter(this.l, m);
    }

    @Override
    public int g() {
        return this.l.size();
    }

    @Override
    public bj_0 a(int n) {
        return (bj_0)((Object)m.convert((Object)this.l.get(n)));
    }

    @Override
    public List<bq_0> h() {
        return new Internal.ListAdapter(this.n, o);
    }

    @Override
    public int i() {
        return this.n.size();
    }

    @Override
    public bq_0 b(int n) {
        return (bq_0)((Object)o.convert((Object)this.n.get(n)));
    }

    @Override
    public boolean j() {
        return (this.i & 4) == 4;
    }

    @Override
    public int k() {
        return this.p;
    }

    @Override
    public boolean l() {
        return (this.i & 8) == 8;
    }

    @Override
    public boolean m() {
        return this.q;
    }

    public final boolean isInitialized() {
        byte by = this.r;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.r = 0;
            return false;
        }
        if (!this.d()) {
            this.r = 0;
            return false;
        }
        if (!this.l()) {
            this.r = 0;
            return false;
        }
        this.r = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.i & 1) == 1) {
            codedOutputStream.writeInt64(1, this.j);
        }
        if ((this.i & 2) == 2) {
            codedOutputStream.writeInt64(2, this.k);
        }
        for (n = 0; n < this.l.size(); ++n) {
            codedOutputStream.writeEnum(3, this.l.get(n).intValue());
        }
        for (n = 0; n < this.n.size(); ++n) {
            codedOutputStream.writeEnum(4, this.n.get(n).intValue());
        }
        if ((this.i & 4) == 4) {
            codedOutputStream.writeInt32(5, this.p);
        }
        if ((this.i & 8) == 8) {
            codedOutputStream.writeBool(6, this.q);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.i & 1) == 1) {
            n2 += CodedOutputStream.computeInt64Size((int)1, (long)this.j);
        }
        if ((this.i & 2) == 2) {
            n2 += CodedOutputStream.computeInt64Size((int)2, (long)this.k);
        }
        int n3 = 0;
        for (n = 0; n < this.l.size(); ++n) {
            n3 += CodedOutputStream.computeEnumSizeNoTag((int)this.l.get(n));
        }
        n2 += n3;
        n2 += 1 * this.l.size();
        n3 = 0;
        for (n = 0; n < this.n.size(); ++n) {
            n3 += CodedOutputStream.computeEnumSizeNoTag((int)this.n.get(n));
        }
        n2 += n3;
        n2 += 1 * this.n.size();
        if ((this.i & 4) == 4) {
            n2 += CodedOutputStream.computeInt32Size((int)5, (int)this.p);
        }
        if ((this.i & 8) == 8) {
            n2 += CodedOutputStream.computeBoolSize((int)6, (boolean)this.q);
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bk_0)) {
            return super.equals(object);
        }
        bk_0 bk_02 = (bk_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == bk_02.b();
        if (this.b()) {
            bl = bl && this.c() == bk_02.c();
        }
        boolean bl3 = bl = bl && this.d() == bk_02.d();
        if (this.d()) {
            bl = bl && this.e() == bk_02.e();
        }
        bl = bl && this.l.equals(bk_02.l);
        bl = bl && this.n.equals(bk_02.n);
        boolean bl4 = bl = bl && this.j() == bk_02.j();
        if (this.j()) {
            bl = bl && this.k() == bk_02.k();
        }
        boolean bl5 = bl = bl && this.l() == bk_02.l();
        if (this.l()) {
            bl = bl && this.m() == bk_02.m();
        }
        bl = bl && this.unknownFields.equals((Object)bk_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bk_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.e());
        }
        if (this.g() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.l.hashCode();
        }
        if (this.i() > 0) {
            n = 37 * n + 4;
            n = 53 * n + this.n.hashCode();
        }
        if (this.j()) {
            n = 37 * n + 5;
            n = 53 * n + this.k();
        }
        if (this.l()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashBoolean((boolean)this.m());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bk_0 a(ByteBuffer byteBuffer) {
        return (bk_0)g.parseFrom(byteBuffer);
    }

    public static bk_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_0)g.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bk_0 a(ByteString byteString) {
        return (bk_0)g.parseFrom(byteString);
    }

    public static bk_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_0)g.parseFrom(byteString, extensionRegistryLite);
    }

    public static bk_0 a(byte[] byArray) {
        return (bk_0)g.parseFrom(byArray);
    }

    public static bk_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_0)g.parseFrom(byArray, extensionRegistryLite);
    }

    public static bk_0 a(InputStream inputStream) {
        return (bk_0)GeneratedMessageV3.parseWithIOException(g, (InputStream)inputStream);
    }

    public static bk_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_0)GeneratedMessageV3.parseWithIOException(g, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bk_0 b(InputStream inputStream) {
        return (bk_0)GeneratedMessageV3.parseDelimitedWithIOException(g, (InputStream)inputStream);
    }

    public static bk_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_0)GeneratedMessageV3.parseDelimitedWithIOException(g, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bk_0 a(CodedInputStream codedInputStream) {
        return (bk_0)GeneratedMessageV3.parseWithIOException(g, (CodedInputStream)codedInputStream);
    }

    public static bk_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bk_0)GeneratedMessageV3.parseWithIOException(g, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bo_0 n() {
        return bk_0.o();
    }

    public static bo_0 o() {
        return s.p();
    }

    public static bo_0 a(bk_0 bk_02) {
        return s.p().a(bk_02);
    }

    public bo_0 p() {
        return this == s ? new bo_0() : new bo_0().a(this);
    }

    protected bo_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        bo_0 bo_02 = new bo_0(builderParent);
        return bo_02;
    }

    public static bk_0 q() {
        return s;
    }

    public static Parser<bk_0> r() {
        return g;
    }

    public Parser<bk_0> getParserForType() {
        return g;
    }

    public bk_0 s() {
        return s;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.p();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.n();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.s();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.s();
    }

    static /* synthetic */ boolean t() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bk_0 bk_02) {
        return bk_02.unknownFields;
    }
}

