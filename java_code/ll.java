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

public final class ll
extends GeneratedMessageV3
implements lo {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    int f;
    public static final int b = 2;
    int g;
    private byte h = (byte)-1;
    private static final ll i = new ll();
    @Deprecated
    public static final Parser<ll> c = new lm_0();

    ll(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ll() {
        this.f = 0;
        this.g = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ll(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt32();
                        continue block11;
                    }
                    case 16: 
                }
                this.e |= 2;
                this.g = codedInputStream.readInt32();
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
        return kM.q;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.r.ensureFieldAccessorsInitialized(ll.class, ln.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public int c() {
        return this.f;
    }

    @Override
    public boolean d() {
        return (this.e & 2) == 2;
    }

    @Override
    public int e() {
        return this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.h = 0;
            return false;
        }
        if (!this.d()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt32(1, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeInt32(2, this.g);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ll)) {
            return super.equals(object);
        }
        ll ll2 = (ll)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ll2.b();
        if (this.b()) {
            bl = bl && this.c() == ll2.c();
        }
        boolean bl3 = bl = bl && this.d() == ll2.d();
        if (this.d()) {
            bl = bl && this.e() == ll2.e();
        }
        bl = bl && this.unknownFields.equals((Object)ll2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ll.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ll a(ByteBuffer byteBuffer) {
        return (ll)c.parseFrom(byteBuffer);
    }

    public static ll a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ll)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ll a(ByteString byteString) {
        return (ll)c.parseFrom(byteString);
    }

    public static ll a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ll)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ll a(byte[] byArray) {
        return (ll)c.parseFrom(byArray);
    }

    public static ll a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ll)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ll a(InputStream inputStream) {
        return (ll)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ll a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ll)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ll b(InputStream inputStream) {
        return (ll)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ll b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ll)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ll a(CodedInputStream codedInputStream) {
        return (ll)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ll a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ll)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ln f() {
        return ll.g();
    }

    public static ln g() {
        return i.h();
    }

    public static ln a(ll ll2) {
        return i.h().a(ll2);
    }

    public ln h() {
        return this == i ? new ln() : new ln().a(this);
    }

    protected ln a(GeneratedMessageV3.BuilderParent builderParent) {
        ln ln2 = new ln(builderParent);
        return ln2;
    }

    public static ll i() {
        return i;
    }

    public static Parser<ll> j() {
        return c;
    }

    public Parser<ll> getParserForType() {
        return c;
    }

    public ll k() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ll ll2) {
        return ll2.unknownFields;
    }
}

