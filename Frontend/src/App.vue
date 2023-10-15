<template>
    <div>
        <RouterView></RouterView>
    </div>
</template>

<script lang="ts">
import { RouterLink, RouterView } from 'vue-router'
import Header from "@/components/home-view-components/Header.vue"

export default {
    name: "app",
    components: {
        Header
    }
}
</script>

<style scoped>

</style>
