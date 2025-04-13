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

public final class Bu
extends GeneratedMessageV3
implements Bx {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    long g;
    public static final int b = 2;
    bl_0 h;
    public static final int c = 3;
    long i;
    private byte j = (byte)-1;
    private static final Bu k = new Bu();
    @Deprecated
    public static final Parser<Bu> d = new Bv();

    Bu(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Bu() {
        this.g = 0L;
        this.i = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    Bu(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.f |= 1;
                        this.g = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        BN bN = null;
                        if ((this.f & 2) == 2) {
                            bN = this.h.t();
                        }
                        this.h = (bl_0)codedInputStream.readMessage(bl_0.g, extensionRegistryLite);
                        if (bN != null) {
                            bN.a(this.h);
                            this.h = bN.u();
                        }
                        this.f |= 2;
                        continue block12;
                    }
                    case 24: 
                }
                this.f |= 4;
                this.i = codedInputStream.readInt64();
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
        return AO.m;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.n.ensureFieldAccessorsInitialized(Bu.class, Bw.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public long c() {
        return this.g;
    }

    @Override
    public boolean d() {
        return (this.f & 2) == 2;
    }

    @Override
    public bl_0 e() {
        return this.h == null ? bl_0.u() : this.h;
    }

    @Override
    public BO f() {
        return this.h == null ? bl_0.u() : this.h;
    }

    @Override
    public boolean g() {
        return (this.f & 4) == 4;
    }

    @Override
    public long h() {
        return this.i;
    }

    public final boolean isInitialized() {
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.j = 0;
            return false;
        }
        if (!this.d()) {
            this.j = 0;
            return false;
        }
        if (!this.e().isInitialized()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.writeInt64(1, this.g);
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)this.e());
        }
        if ((this.f & 4) == 4) {
            codedOutputStream.writeInt64(3, this.i);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.f & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.g);
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.e());
        }
        if ((this.f & 4) == 4) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.i);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Bu)) {
            return super.equals(object);
        }
        Bu bu = (Bu)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == bu.b();
        if (this.b()) {
            bl = bl && this.c() == bu.c();
        }
        boolean bl3 = bl = bl && this.d() == bu.d();
        if (this.d()) {
            bl = bl && this.e().equals(bu.e());
        }
        boolean bl4 = bl = bl && this.g() == bu.g();
        if (this.g()) {
            bl = bl && this.h() == bu.h();
        }
        bl = bl && this.unknownFields.equals((Object)bu.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + Bu.a().hashCode();
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
            n = 53 * n + Internal.hashLong((long)this.h());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static Bu a(ByteBuffer byteBuffer) {
        return (Bu)d.parseFrom(byteBuffer);
    }

    public static Bu a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Bu)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Bu a(ByteString byteString) {
        return (Bu)d.parseFrom(byteString);
    }

    public static Bu a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Bu)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static Bu a(byte[] byArray) {
        return (Bu)d.parseFrom(byArray);
    }

    public static Bu a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Bu)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static Bu a(InputStream inputStream) {
        return (Bu)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static Bu a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Bu)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Bu b(InputStream inputStream) {
        return (Bu)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static Bu b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Bu)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Bu a(CodedInputStream codedInputStream) {
        return (Bu)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static Bu a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Bu)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public Bw i() {
        return Bu.j();
    }

    public static Bw j() {
        return k.k();
    }

    public static Bw a(Bu bu) {
        return k.k().a(bu);
    }

    public Bw k() {
        return this == k ? new Bw() : new Bw().a(this);
    }

    protected Bw a(GeneratedMessageV3.BuilderParent builderParent) {
        Bw bw = new Bw(builderParent);
        return bw;
    }

    public static Bu l() {
        return k;
    }

    public static Parser<Bu> m() {
        return d;
    }

    public Parser<Bu> getParserForType() {
        return d;
    }

    public Bu n() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.n();
    }

    static /* synthetic */ boolean o() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(Bu bu) {
        return bu.unknownFields;
    }
}

