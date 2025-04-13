/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from S
 */
public final class s_0
extends GeneratedMessageV3.Builder<s_0>
implements V {
    private long a;
    private long b;
    private int c = 0;

    public static final Descriptors.Descriptor a() {
        return e_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.f.ensureFieldAccessorsInitialized(Q.class, s_0.class);
    }

    s_0() {
        this.n();
    }

    s_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.n();
    }

    private void n() {
        if (Q.l()) {
            // empty if block
        }
    }

    public s_0 f() {
        super.clear();
        this.a = 0L;
        this.b = 0L;
        this.c = 0;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return e_0.e;
    }

    public Q g() {
        return Q.i();
    }

    public Q h() {
        Q q = this.i();
        if (!q.isInitialized()) {
            throw s_0.newUninitializedMessageException((Message)q);
        }
        return q;
    }

    public Q i() {
        Q q = new Q(this);
        q.e = this.a;
        q.f = this.b;
        q.g = this.c;
        this.onBuilt();
        return q;
    }

    public s_0 j() {
        return (s_0)super.clone();
    }

    public s_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (s_0)super.setField(fieldDescriptor, object);
    }

    public s_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (s_0)super.clearField(fieldDescriptor);
    }

    public s_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (s_0)super.clearOneof(oneofDescriptor);
    }

    public s_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (s_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public s_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (s_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public s_0 a(Message message) {
        if (message instanceof Q) {
            return this.a((Q)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public s_0 a(Q q) {
        if (q == Q.i()) {
            return this;
        }
        if (q.b() != 0L) {
            this.a(q.b());
        }
        if (q.c() != 0L) {
            this.b(q.c());
        }
        if (q.g != 0) {
            this.a(q.d());
        }
        this.b(Q.b(q));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public s_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Q q = null;
        try {
            q = (Q)Q.j.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            q = (Q)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (q != null) {
                this.a(q);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public s_0 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public s_0 k() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public long c() {
        return this.b;
    }

    public s_0 b(long l) {
        this.b = l;
        this.onChanged();
        return this;
    }

    public s_0 l() {
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public int d() {
        return this.c;
    }

    public s_0 a(int n) {
        this.c = n;
        this.onChanged();
        return this;
    }

    @Override
    public T e() {
        T t = T.a(this.c);
        return t == null ? T.d : t;
    }

    public s_0 a(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        this.c = t.getNumber();
        this.onChanged();
        return this;
    }

    public s_0 m() {
        this.c = 0;
        this.onChanged();
        return this;
    }

    public final s_0 a(UnknownFieldSet unknownFieldSet) {
        return (s_0)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final s_0 b(UnknownFieldSet unknownFieldSet) {
        return (s_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.f();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.j();
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
        return this.f();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.j();
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
        return this.j();
    }

    public /* synthetic */ Message buildPartial() {
        return this.i();
    }

    public /* synthetic */ Message build() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.i();
    }

    public /* synthetic */ MessageLite build() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Object clone() {
        return this.j();
    }
}

