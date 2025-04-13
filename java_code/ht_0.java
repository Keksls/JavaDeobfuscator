/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from ht
 */
public final class ht_0
extends GeneratedMessageV3.Builder<ht_0>
implements hu_0 {
    private int a;
    private int b;
    private boolean c;
    private Object d = "";
    private int e;
    private long f;
    private Object g = "";

    public static final Descriptors.Descriptor a() {
        return hl_0.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hl_0.h.ensureFieldAccessorsInitialized(hr_0.class, ht_0.class);
    }

    ht_0() {
        this.A();
    }

    ht_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.A();
    }

    private void A() {
        if (hr_0.v()) {
            // empty if block
        }
    }

    public ht_0 p() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = false;
        this.a &= 0xFFFFFFFD;
        this.d = "";
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        this.f = 0L;
        this.a &= 0xFFFFFFEF;
        this.g = "";
        this.a &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hl_0.g;
    }

    public hr_0 q() {
        return hr_0.s();
    }

    public hr_0 r() {
        hr_0 hr_02 = this.s();
        if (!hr_02.isInitialized()) {
            throw ht_0.newUninitializedMessageException((Message)hr_02);
        }
        return hr_02;
    }

    public hr_0 s() {
        hr_0 hr_02 = new hr_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        hr_02.j = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        hr_02.k = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        hr_02.l = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        hr_02.m = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        hr_02.n = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        hr_02.o = this.g;
        hr_02.i = n2;
        this.onBuilt();
        return hr_02;
    }

    public ht_0 t() {
        return (ht_0)super.clone();
    }

    public ht_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ht_0)super.setField(fieldDescriptor, object);
    }

    public ht_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ht_0)super.clearField(fieldDescriptor);
    }

    public ht_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ht_0)super.clearOneof(oneofDescriptor);
    }

    public ht_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ht_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ht_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ht_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ht_0 a(Message message) {
        if (message instanceof hr_0) {
            return this.a((hr_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ht_0 a(hr_0 hr_02) {
        if (hr_02 == hr_0.s()) {
            return this;
        }
        if (hr_02.b()) {
            this.a(hr_02.c());
        }
        if (hr_02.d()) {
            this.a(hr_02.e());
        }
        if (hr_02.f()) {
            this.a |= 4;
            this.d = hr_02.l;
            this.onChanged();
        }
        if (hr_02.i()) {
            this.b(hr_02.j());
        }
        if (hr_02.k()) {
            this.a(hr_02.l());
        }
        if (hr_02.m()) {
            this.a |= 0x20;
            this.g = hr_02.o;
            this.onChanged();
        }
        this.b(hr_0.b(hr_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return this.b();
    }

    public ht_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hr_0 hr_02 = null;
        try {
            hr_02 = (hr_0)hr_0.g.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hr_02 = (hr_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hr_02 != null) {
                this.a(hr_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public ht_0 a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public ht_0 u() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public boolean e() {
        return this.c;
    }

    public ht_0 a(boolean bl) {
        this.a |= 2;
        this.c = bl;
        this.onChanged();
        return this;
    }

    public ht_0 v() {
        this.a &= 0xFFFFFFFD;
        this.c = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public String g() {
        Object object = this.d;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.d = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString h() {
        Object object = this.d;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.d = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ht_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = string;
        this.onChanged();
        return this;
    }

    public ht_0 w() {
        this.a &= 0xFFFFFFFB;
        this.d = hr_0.s().g();
        this.onChanged();
        return this;
    }

    public ht_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public int j() {
        return this.e;
    }

    public ht_0 b(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public ht_0 x() {
        this.a &= 0xFFFFFFF7;
        this.e = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean k() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public long l() {
        return this.f;
    }

    public ht_0 a(long l) {
        this.a |= 0x10;
        this.f = l;
        this.onChanged();
        return this;
    }

    public ht_0 y() {
        this.a &= 0xFFFFFFEF;
        this.f = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean m() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public String n() {
        Object object = this.g;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.g = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString o() {
        Object object = this.g;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.g = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public ht_0 b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x20;
        this.g = string;
        this.onChanged();
        return this;
    }

    public ht_0 z() {
        this.a &= 0xFFFFFFDF;
        this.g = hr_0.s().n();
        this.onChanged();
        return this;
    }

    public ht_0 b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x20;
        this.g = byteString;
        this.onChanged();
        return this;
    }

    public final ht_0 a(UnknownFieldSet unknownFieldSet) {
        return (ht_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ht_0 b(UnknownFieldSet unknownFieldSet) {
        return (ht_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.p();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.t();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.p();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.t();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.t();
    }

    public /* synthetic */ Message buildPartial() {
        return this.s();
    }

    public /* synthetic */ Message build() {
        return this.r();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.t();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.s();
    }

    public /* synthetic */ MessageLite build() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.p();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.t();
    }

    public /* synthetic */ Object clone() {
        return this.t();
    }
}

