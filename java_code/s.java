/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class s
extends GeneratedMessageV3.Builder<s>
implements t_0 {
    private int a;
    private List<j> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<j, l_0, u_0> c;

    public static final Descriptors.Descriptor a() {
        return g_0.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.j.ensureFieldAccessorsInitialized(q_0.class, s.class);
    }

    s() {
        this.m();
    }

    s(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (q_0.k()) {
            this.o();
        }
    }

    public s e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return g_0.i;
    }

    public q_0 f() {
        return q_0.h();
    }

    public q_0 g() {
        q_0 q_02 = this.h();
        if (!q_02.isInitialized()) {
            throw s.newUninitializedMessageException((Message)q_02);
        }
        return q_02;
    }

    public q_0 h() {
        q_0 q_02 = new q_0(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            q_02.c = this.b;
        } else {
            q_02.c = this.c.build();
        }
        this.onBuilt();
        return q_02;
    }

    public s i() {
        return (s)super.clone();
    }

    public s a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (s)super.setField(fieldDescriptor, object);
    }

    public s a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (s)super.clearField(fieldDescriptor);
    }

    public s a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (s)super.clearOneof(oneofDescriptor);
    }

    public s a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (s)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public s b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (s)super.addRepeatedField(fieldDescriptor, object);
    }

    public s a(Message message) {
        if (message instanceof q_0) {
            return this.a((q_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public s a(q_0 q_02) {
        if (q_02 == q_0.h()) {
            return this;
        }
        if (this.c == null) {
            if (!q_02.c.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = q_02.c;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(q_02.c);
                }
                this.onChanged();
            }
        } else if (!q_02.c.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = q_02.c;
                this.a &= 0xFFFFFFFE;
                this.c = q_0.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(q_02.c);
            }
        }
        this.b(q_0.b(q_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public s a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        q_0 q_02 = null;
        try {
            q_02 = (q_0)q_0.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            q_02 = (q_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (q_02 != null) {
                this.a(q_02);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<j>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<j> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public j a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (j)this.c.getMessage(n);
    }

    public s a(int n, j j2) {
        if (this.c == null) {
            if (j2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, j2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)j2);
        }
        return this;
    }

    public s a(int n, l_0 l_02) {
        if (this.c == null) {
            this.n();
            this.b.set(n, l_02.n());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)l_02.n());
        }
        return this;
    }

    public s a(j j2) {
        if (this.c == null) {
            if (j2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(j2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)j2);
        }
        return this;
    }

    public s b(int n, j j2) {
        if (this.c == null) {
            if (j2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, j2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)j2);
        }
        return this;
    }

    public s a(l_0 l_02) {
        if (this.c == null) {
            this.n();
            this.b.add(l_02.n());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)l_02.n());
        }
        return this;
    }

    public s b(int n, l_0 l_02) {
        if (this.c == null) {
            this.n();
            this.b.add(n, l_02.n());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)l_02.n());
        }
        return this;
    }

    public s a(Iterable<? extends j> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public s j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public s c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public l_0 d(int n) {
        return (l_0)this.o().getBuilder(n);
    }

    @Override
    public u_0 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (u_0)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends u_0> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public l_0 k() {
        return (l_0)this.o().addBuilder((AbstractMessage)j.o());
    }

    public l_0 e(int n) {
        return (l_0)this.o().addBuilder(n, (AbstractMessage)j.o());
    }

    public List<l_0> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<j, l_0, u_0> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final s a(UnknownFieldSet unknownFieldSet) {
        return (s)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final s b(UnknownFieldSet unknownFieldSet) {
        return (s)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

