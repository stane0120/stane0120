import React, { useState } from 'react';

const Number = () => {

    const [count, setCount] = useState(1);

    return (
        <div class="NumberLine">
            
            <button class="button1" onClick = { () => setCount(count - 1)}>-</button>

            <h3>{count}</h3>
            
            <button class="button2" onClick = { () => setCount(count + 1)}>+</button>
        </div>
    );
}

export default Number;