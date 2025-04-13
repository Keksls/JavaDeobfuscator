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
 * Renamed from gP
 */
public final class gp_2
extends GeneratedMessageV3
implements gs_1 {
    private static final long j = 0L;
    int k;
    public static final int a = 1;
    int l;
    public static final int b = 2;
    int m;
    public static final int c = 3;
    boolean n;
    public static final int d = 4;
    boolean o;
    public static final int e = 5;
    boolean p;
    public static final int f = 6;
    boolean q;
    public static final int g = 7;
    List<Long> r;
    public static final int h = 8;
    int s;
    private byte t = (byte)-1;
    private static final gp_2 u = new gp_2();
    @Deprecated
    public static final Parser<gp_2> i = new gq_2();

    gp_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gp_2() {
        this.l = 0;
        this.m = 0;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = Collections.emptyList();
        this.s = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gp_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block18: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block18;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block18;
                        bl = true;
                        continue block18;
                    }
                    case 8: {
                        this.k |= 1;
                        this.l = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 16: {
                        this.k |= 2;
                        this.m = codedInputStream.readInt32();
                        continue block18;
                    }
                    case 24: {
                        this.k |= 4;
                        this.n = codedInputStream.readBool();
                        continue block18;
                    }
                    case 32: {
                        this.k |= 8;
                        this.o = codedInputStream.readBool();
                        continue block18;
                    }
                    case 40: {
                        this.k |= 0x10;
                        this.p = codedInputStream.readBool();
                        continue block18;
                    }
                    case 48: {
                        this.k |= 0x20;
                        this.q = codedInputStream.readBool();
                        continue block18;
                    }
                    case 56: {
                        if ((n & 0x40) != 64) {
                            this.r = new ArrayList<Long>();
                            n |= 0x40;
                        }
                        this.r.add(codedInputStream.readInt64());
                        continue block18;
                    }
                    case 58: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 0x40) != 64 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.r = new ArrayList<Long>();
                            n |= 0x40;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.r.add(codedInputStream.readInt64());
                        }
                        codedInputStream.popLimit(n4);
                        continue block18;
                    }
                    case 64: 
                }
                this.k |= 0x40;
                this.s = codedInputStream.readInt32();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 0x40) == 64) {
                this.r = Collections.unmodifiableList(this.r);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return gn_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gn_1.b.ensureFieldAccessorsInitialized(gp_2.class, gr_1.class);
    }

    @Override
    public boolean b() {
        return (this.k & 1) == 1;
    }

    @Override
    public int c() {
        return this.l;
    }

    @Override
    public boolean d() {
        return (this.k & 2) == 2;
    }

    @Override
    public int e() {
        return this.m;
    }

    @Override
    public boolean f() {
        return (this.k & 4) == 4;
    }

    @Override
    public boolean g() {
        return this.n;
    }

    @Override
    public boolean h() {
        return (this.k & 8) == 8;
    }

    @Override
    public boolean i() {
        return this.o;
    }

    @Override
    public boolean j() {
        return (this.k & 0x10) == 16;
    }

    @Override
    public boolean k() {
        return this.p;
    }

    @Override
    public boolean l() {
        return (this.k & 0x20) == 32;
    }

    @Override
    public boolean m() {
        return this.q;
    }

    @Override
    public List<Long> n() {
        return this.r;
    }

    @Override
    public int o() {
        return this.r.size();
    }

    @Override
    public long a(int n) {
        return this.r.get(n);
    }

    @Override
    public boolean p() {
        return (this.k & 0x40) == 64;
    }

    @Override
    public int q() {
        return this.s;
    }

    public final boolean isInitialized() {
        byte by = this.t;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.t = 0;
            return false;
        }
        if (!this.d()) {
            this.t = 0;
            return false;
        }
        if (!this.f()) {
            this.t = 0;
            return false;
        }
        if (!this.h()) {
            this.t = 0;
            return false;
        }
        if (!this.j()) {
            this.t = 0;
            return false;
        }
        if (!this.l()) {
            this.t = 0;
            return false;
        }
        if (!this.p()) {
            this.t = 0;
            return false;
        }
        this.t = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.k & 1) == 1) {
            codedOutputStream.writeInt32(1, this.l);
        }
        if ((this.k & 2) == 2) {
            codedOutputStream.writeInt32(2, this.m);
        }
        if ((this.k & 4) == 4) {
            codedOutputStream.writeBool(3, this.n);
        }
        if ((this.k & 8) == 8) {
            codedOutputStream.writeBool(4, this.o);
        }
        if ((this.k & 0x10) == 16) {
            codedOutputStream.writeBool(5, this.p);
        }
        if ((this.k & 0x20) == 32) {
            codedOutputStream.writeBool(6, this.q);
        }
        for (int k = 0; k < this.r.size(); ++k) {
            codedOutputStream.writeInt64(7, this.r.get(k).longValue());
        }
        if ((this.k & 0x40) == 64) {
            codedOutputStream.writeInt32(8, this.s);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.k & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.l);
        }
        if ((this.k & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.m);
        }
        if ((this.k & 4) == 4) {
            n += CodedOutputStream.computeBoolSize((int)3, (boolean)this.n);
        }
        if ((this.k & 8) == 8) {
            n += CodedOutputStream.computeBoolSize((int)4, (boolean)this.o);
        }
        if ((this.k & 0x10) == 16) {
            n += CodedOutputStream.computeBoolSize((int)5, (boolean)this.p);
        }
        if ((this.k & 0x20) == 32) {
            n += CodedOutputStream.computeBoolSize((int)6, (boolean)this.q);
        }
        int n2 = 0;
        for (int k = 0; k < this.r.size(); ++k) {
            n2 += CodedOutputStream.computeInt64SizeNoTag((long)this.r.get(k));
        }
        n += n2;
        n += 1 * this.n().size();
        if ((this.k & 0x40) == 64) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.s);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gp_2)) {
            return super.equals(object);
        }
        gp_2 gp_22 = (gp_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == gp_22.b();
        if (this.b()) {
            bl = bl && this.c() == gp_22.c();
        }
        boolean bl3 = bl = bl && this.d() == gp_22.d();
        if (this.d()) {
            bl = bl && this.e() == gp_22.e();
        }
        boolean bl4 = bl = bl && this.f() == gp_22.f();
        if (this.f()) {
            bl = bl && this.g() == gp_22.g();
        }
        boolean bl5 = bl = bl && this.h() == gp_22.h();
        if (this.h()) {
            bl = bl && this.i() == gp_22.i();
        }
        boolean bl6 = bl = bl && this.j() == gp_22.j();
        if (this.j()) {
            bl = bl && this.k() == gp_22.k();
        }
        boolean bl7 = bl = bl && this.l() == gp_22.l();
        if (this.l()) {
            bl = bl && this.m() == gp_22.m();
        }
        bl = bl && this.n().equals(gp_22.n());
        boolean bl8 = bl = bl && this.p() == gp_22.p();
        if (this.p()) {
            bl = bl && this.q() == gp_22.q();
        }
        bl = bl && this.unknownFields.equals((Object)gp_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gp_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashBoolean((boolean)this.g());
        }
        if (this.h()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.i());
        }
        if (this.j()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashBoolean((boolean)this.k());
        }
        if (this.l()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashBoolean((boolean)this.m());
        }
        if (this.o() > 0) {
            n = 37 * n + 7;
            n = 53 * n + this.n().hashCode();
        }
        if (this.p()) {
            n = 37 * n + 8;
            n = 53 * n + this.q();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gp_2 a(ByteBuffer byteBuffer) {
        return (gp_2)i.parseFrom(byteBuffer);
    }

    public static gp_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gp_2)i.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gp_2 a(ByteString byteString) {
        return (gp_2)i.parseFrom(byteString);
    }

    public static gp_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gp_2)i.parseFrom(byteString, extensionRegistryLite);
    }

    public static gp_2 a(byte[] byArray) {
        return (gp_2)i.parseFrom(byArray);
    }

    public static gp_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gp_2)i.parseFrom(byArray, extensionRegistryLite);
    }

    public static gp_2 a(InputStream inputStream) {
        return (gp_2)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream);
    }

    public static gp_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gp_2)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gp_2 b(InputStream inputStream) {
        return (gp_2)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream);
    }

    public static gp_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gp_2)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gp_2 a(CodedInputStream codedInputStream) {
        return (gp_2)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream);
    }

    public static gp_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gp_2)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gr_1 r() {
        return gp_2.s();
    }

    public static gr_1 s() {
        return u.t();
    }

    public static gr_1 a(gp_2 gp_22) {
        return u.t().a(gp_22);
    }

    public gr_1 t() {
        return this == u ? new gr_1() : new gr_1().a(this);
    }

    protected gr_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        gr_1 gr_12 = new gr_1(builderParent);
        return gr_12;
    }

    public static gp_2 u() {
        return u;
    }

    public static Parser<gp_2> v() {
        return i;
    }

    public Parser<gp_2> getParserForType() {
        return i;
    }

    public gp_2 w() {
        return u;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.t();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.t();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.r();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.w();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.w();
    }

    static /* synthetic */ boolean x() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gp_2 gp_22) {
        return gp_22.unknownFields;
    }
}

