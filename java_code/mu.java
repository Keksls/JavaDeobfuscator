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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class mu
extends GeneratedMessageV3
implements mx_0 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    int g;
    public static final int b = 2;
    int h;
    public static final int c = 3;
    int i;
    private byte j = (byte)-1;
    private static final mu k = new mu();
    @Deprecated
    public static final Parser<mu> d = new mv();

    mu(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mu() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mu(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.g = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.f |= 2;
                        this.h = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 24: 
                }
                this.f |= 4;
                this.i = codedInputStream.readInt32();
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
        return mk.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mk.d.ensureFieldAccessorsInitialized(mu.class, mw.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public int c() {
        return this.g;
    }

    @Override
    public boolean d() {
        return (this.f & 2) == 2;
    }

    @Override
    public int e() {
        return this.h;
    }

    @Override
    public boolean f() {
        return (this.f & 4) == 4;
    }

    @Override
    public int g() {
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
        if (!this.f()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.writeInt32(1, this.g);
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.writeInt32(2, this.h);
        }
        if ((this.f & 4) == 4) {
            codedOutputStream.writeInt32(3, this.i);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.g);
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.h);
        }
        if ((this.f & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.i);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mu)) {
            return super.equals(object);
        }
        mu mu2 = (mu)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == mu2.b();
        if (this.b()) {
            bl = bl && this.c() == mu2.c();
        }
        boolean bl3 = bl = bl && this.d() == mu2.d();
        if (this.d()) {
            bl = bl && this.e() == mu2.e();
        }
        boolean bl4 = bl = bl && this.f() == mu2.f();
        if (this.f()) {
            bl = bl && this.g() == mu2.g();
        }
        bl = bl && this.unknownFields.equals((Object)mu2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mu.a().hashCode();
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
            n = 53 * n + this.g();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mu a(ByteBuffer byteBuffer) {
        return (mu)d.parseFrom(byteBuffer);
    }

    public static mu a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mu)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mu a(ByteString byteString) {
        return (mu)d.parseFrom(byteString);
    }

    public static mu a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mu)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static mu a(byte[] byArray) {
        return (mu)d.parseFrom(byArray);
    }

    public static mu a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mu)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static mu a(InputStream inputStream) {
        return (mu)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static mu a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mu)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mu b(InputStream inputStream) {
        return (mu)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static mu b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mu)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mu a(CodedInputStream codedInputStream) {
        return (mu)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static mu a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mu)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mw h() {
        return mu.i();
    }

    public static mw i() {
        return k.j();
    }

    public static mw a(mu mu2) {
        return k.j().a(mu2);
    }

    public mw j() {
        return this == k ? new mw() : new mw().a(this);
    }

    protected mw a(GeneratedMessageV3.BuilderParent builderParent) {
        mw mw2 = new mw(builderParent);
        return mw2;
    }

    public static mu k() {
        return k;
    }

    public static Parser<mu> l() {
        return d;
    }

    public Parser<mu> getParserForType() {
        return d;
    }

    public mu m() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    static /* synthetic */ boolean n() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mu mu2) {
        return mu2.unknownFields;
    }
}

