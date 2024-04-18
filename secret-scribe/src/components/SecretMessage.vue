<template>
    <div class="container">
        <div class="field">
            <label class="label">Enter your message...</label>
            <div class="control">
                <textarea class="textarea" placeholder="e.g. Hello world"></textarea>
            </div>
        </div>
        <div class="field">

            <div class="control">
                <div class="select">
                    <select>
                        <option>Select dropdown</option>
                        <option>Caesar Cipher</option>
                        <option>Morse Code</option>
                        <option>Pig Latin</option>
                    </select>
                </div>
            </div>
        </div>

        <div class="field is-grouped">
            <div class="control">
                <button class="button is-dark">Code</button>
            </div>
            <div class="control">
                <button class="button is-dark">Decode</button>
            </div>
        </div>
    </div>
</template>