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

public final class nk
extends GeneratedMessageV3
implements nn {
    private static final long g = 0L;
    int h;
    public static final int a = 1;
    long i;
    public static final int b = 2;
    le_0 j;
    public static final int c = 3;
    int k;
    public static final int d = 5;
    long l;
    public static final int e = 6;
    long m;
    private byte n = (byte)-1;
    private static final nk o = new nk();
    @Deprecated
    public static final Parser<nk> f = new nl();

    nk(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private nk() {
        this.i = 0L;
        this.k = 0;
        this.l = 0L;
        this.m = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    nk(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block14;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block14;
                        bl2 = true;
                        continue block14;
                    }
                    case 8: {
                        this.h |= 1;
                        this.i = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 18: {
                        lg lg2 = null;
                        if ((this.h & 2) == 2) {
                            lg2 = this.j.G();
                        }
                        this.j = (le_0)codedInputStream.readMessage(le_0.l, extensionRegistryLite);
                        if (lg2 != null) {
                            lg2.a(this.j);
                            this.j = lg2.H();
                        }
                        this.h |= 2;
                        continue block14;
                    }
                    case 24: {
                        this.h |= 4;
                        this.k = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 40: {
                        this.h |= 8;
                        this.l = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 48: 
                }
                this.h |= 0x10;
                this.m = codedInputStream.readInt64();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return ni.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ni.d.ensureFieldAccessorsInitialized(nk.class, nm.class);
    }

    @Override
    public boolean b() {
        return (this.h & 1) == 1;
    }

    @Override
    public long c() {
        return this.i;
    }

    @Override
    public boolean d() {
        return (this.h & 2) == 2;
    }

    @Override
    public le_0 e() {
        return this.j == null ? le_0.H() : this.j;
    }

    @Override
    public lp f() {
        return this.j == null ? le_0.H() : this.j;
    }

    @Override
    public boolean g() {
        return (this.h & 4) == 4;
    }

    @Override
    public int h() {
        return this.k;
    }

    @Override
    public boolean i() {
        return (this.h & 8) == 8;
    }

    @Override
    public long j() {
        return this.l;
    }

    @Override
    public boolean k() {
        return (this.h & 0x10) == 16;
    }

    @Override
    public long l() {
        return this.m;
    }

    public final boolean isInitialized() {
        byte by = this.n;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.n = 0;
            return false;
        }
        if (!this.d()) {
            this.n = 0;
            return false;
        }
        if (!this.g()) {
            this.n = 0;
            return false;
        }
        if (!this.i()) {
            this.n = 0;
            return false;
        }
        if (!this.k()) {
            this.n = 0;
            return false;
        }
        if (!this.e().isInitialized()) {
            this.n = 0;
            return false;
        }
        this.n = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.h & 1) == 1) {
            codedOutputStream.writeInt64(1, this.i);
        }
        if ((this.h & 2) == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)this.e());
        }
        if ((this.h & 4) == 4) {
            codedOutputStream.writeInt32(3, this.k);
        }
        if ((this.h & 8) == 8) {
            codedOutputStream.writeInt64(5, this.l);
        }
        if ((this.h & 0x10) == 16) {
            codedOutputStream.writeInt64(6, this.m);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.h & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.i);
        }
        if ((this.h & 2) == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.e());
        }
        if ((this.h & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.k);
        }
        if ((this.h & 8) == 8) {
            n += CodedOutputStream.computeInt64Size((int)5, (long)this.l);
        }
        if ((this.h & 0x10) == 16) {
            n += CodedOutputStream.computeInt64Size((int)6, (long)this.m);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof nk)) {
            return super.equals(object);
        }
        nk nk2 = (nk)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == nk2.b();
        if (this.b()) {
            bl = bl && this.c() == nk2.c();
        }
        boolean bl3 = bl = bl && this.d() == nk2.d();
        if (this.d()) {
            bl = bl && this.e().equals(nk2.e());
        }
        boolean bl4 = bl = bl && this.g() == nk2.g();
        if (this.g()) {
            bl = bl && this.h() == nk2.h();
        }
        boolean bl5 = bl = bl && this.i() == nk2.i();
        if (this.i()) {
            bl = bl && this.j() == nk2.j();
        }
        boolean bl6 = bl = bl && this.k() == nk2.k();
        if (this.k()) {
            bl = bl && this.l() == nk2.l();
        }
        bl = bl && this.unknownFields.equals((Object)nk2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + nk.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.g()) {
            n = 37 * n + 3;
            n = 53 * n + this.h();
        }
        if (this.i()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashLong((long)this.j());
        }
        if (this.k()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashLong((long)this.l());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static nk a(ByteBuffer byteBuffer) {
        return (nk)f.parseFrom(byteBuffer);
    }

    public static nk a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (nk)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static nk a(ByteString byteString) {
        return (nk)f.parseFrom(byteString);
    }

    public static nk a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (nk)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static nk a(byte[] byArray) {
        return (nk)f.parseFrom(byArray);
    }

    public static nk a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (nk)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static nk a(InputStream inputStream) {
        return (nk)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static nk a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nk)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nk b(InputStream inputStream) {
        return (nk)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static nk b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nk)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static nk a(CodedInputStream codedInputStream) {
        return (nk)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static nk a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (nk)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nm m() {
        return nk.n();
    }

    public static nm n() {
        return o.o();
    }

    public static nm a(nk nk2) {
        return o.o().a(nk2);
    }

    public nm o() {
        return this == o ? new nm() : new nm().a(this);
    }

    protected nm a(GeneratedMessageV3.BuilderParent builderParent) {
        nm nm2 = new nm(builderParent);
        return nm2;
    }

    public static nk p() {
        return o;
    }

    public static Parser<nk> q() {
        return f;
    }

    public Parser<nk> getParserForType() {
        return f;
    }

    public nk r() {
        return o;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.r();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.r();
    }

    static /* synthetic */ boolean s() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(nk nk2) {
        return nk2.unknownFields;
    }
}

