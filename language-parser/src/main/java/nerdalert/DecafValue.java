package nerdalert;

public class DecafValue
{
    private Object value;

    public DecafValue()
    {
        value = new Object();
    }

    public DecafValue(Object value)
    {
        if(value == null) {
            throw new RuntimeException("DecafValue cannot be null!");
        }
        this.value = value;
        // only accept boolean, list, number or string types
        if(!(isBoolean() || isInt() || isDouble() || isString())) {
            throw new RuntimeException("Invalid datatype!");
        }
    }

    public Boolean asBoolean()
    {
        return Boolean.parseBoolean(this.asString());
    }

    public int asInt()
    {
        return (Integer) value;
    }

    public Double asDouble()
    {
        return ((Number)value).doubleValue();
    }

    public String asString() {
        return value.toString();
    }

    public int compareTo(DecafValue that)
    {
        if((this.isInt() && that.isInt()) || (this.isDouble() && that.isDouble()) || (this.isBoolean() && that.isBoolean()))
        {
            if(this.equals(that))
            {
                return 0;
            }
            else
            {
                return this.asDouble().compareTo(that.asDouble());
            }
        }
        else if(this.isString() && that.isString())
        {
            return this.asString().compareTo(that.asString());
        }
        else
        {
            throw new RuntimeException("illegal expression: can't compare `" + this + "` to `" + that + "`");
        }
    }

    @Override
    public boolean equals(Object object)
    {
        if(this == object)
        {
            return true;
        }
        if(object == null || this.getClass() != object.getClass())
        {
            return false;
        }
        DecafValue that = (DecafValue) object;
        if(this.isDouble() && that.isDouble())
        {
            double diff = Math.abs(this.asDouble() - that.asDouble());
            return diff < 0.00000000001;
        }
        else if (this.isInt() && that.isInt())
        {
            return this.asInt() == that.asInt();
        }
        else
        {
            return this.value.equals(that.value);
        }
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }

    public boolean isBoolean()
    {
        return value instanceof Boolean;
    }

    public boolean isInt()
    {
        return value instanceof Integer;
    }

    public boolean isDouble()
    {
        return value instanceof Double;
    }

    public boolean isString()
    {
        return value instanceof String;
    }
}