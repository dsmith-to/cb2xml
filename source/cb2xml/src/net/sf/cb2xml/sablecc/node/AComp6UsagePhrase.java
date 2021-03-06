/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.cb2xml.sablecc.node;

import java.util.*;
import net.sf.cb2xml.sablecc.analysis.*;

public final class AComp6UsagePhrase extends PUsagePhrase
{
    private TComp6 _comp6_;

    public AComp6UsagePhrase()
    {
    }

    public AComp6UsagePhrase(
        TComp6 _comp6_)
    {
        setComp6(_comp6_);

    }
    public Object clone()
    {
        return new AComp6UsagePhrase(
            (TComp6) cloneNode(_comp6_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComp6UsagePhrase(this);
    }

    public TComp6 getComp6()
    {
        return _comp6_;
    }

    public void setComp6(TComp6 node)
    {
        if(_comp6_ != null)
        {
            _comp6_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comp6_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_comp6_);
    }

    void removeChild(Node child)
    {
        if(_comp6_ == child)
        {
            _comp6_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_comp6_ == oldChild)
        {
            setComp6((TComp6) newChild);
            return;
        }

    }
}
